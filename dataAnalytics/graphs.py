import json
import pandas as pd
import matplotlib.pyplot as plt
from vaderSentiment.vaderSentiment import SentimentIntensityAnalyzer

# Load JSON data
with open('comments.json', 'r') as f:
    data = json.load(f)

comments = []

for commentObj in data:
    for comment in commentObj.get('Comments'):
        comments.append(comment.get('comment'))



# Initialize sentiment analyzer
analyzer = SentimentIntensityAnalyzer()

# Define programming languages to analyze
languages = ['Python', 'Java', 'JavaScript', 'C#', 'C++', 'Ruby', 'PHP']

# Analyze sentiment
sentiment_data = {lang: {'positive': 0, 'neutral': 0, 'negative': 0} for lang in languages}

for comment in comments:
    for lang in languages:
        if lang in comment:
            sentiment = analyzer.polarity_scores(comment)
            if sentiment['compound'] >= 0.05:
                sentiment_data[lang]['positive'] += 1
            elif sentiment['compound'] <= -0.05:
                sentiment_data[lang]['negative'] += 1
            else:
                sentiment_data[lang]['neutral'] += 1

# Create DataFrame
df = pd.DataFrame(sentiment_data).transpose()




# Create bar chart
# df.plot(kind='bar', stacked=True)
# plt.xlabel('Programming Languages')
# plt.ylabel('Number of Comments')
# plt.title('Sentiment Analysis of Comments')
# plt.legend(['Positive', 'Neutral', 'Negative'])
# plt.show()

df['total'] = df['positive'] + df['neutral'] + df['negative']
df['positive_pct'] = df['positive'] / df['total'] * 100
df['neutral_pct'] = df['neutral'] / df['total'] * 100
df['negative_pct'] = df['negative'] / df['total'] * 100

# df = df.T

# df = df.T.loc[['positive_pct','neutral_pct','negative_pct']]
df = df.fillna(0).astype(float)
df.columns.str.replace(' ', '')
df.columns.str.replace('\n', '')

df = df.T
df= df.loc[['neutral_pct', 'positive_pct', 'negative_pct']]
df = df.fillna(0).astype(float)

print(df.T)


# df = df.loc[['positive_pct']]


df.reset_index()
rowIndex = 0
colIndex = 0
tempIndex = 0




df.T.plot.pie(subplots='True', figsize=(15, 15), layout=(2,4), legend=False)
plt.show()

    


