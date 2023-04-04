import praw
import json

reddit = praw.Reddit(client_id='263GV5DYKIR8X7wcCesN0g', 
client_secret='lnlF1rEV1dE_xJWXpCU8WvGdGBXR2g',
user_agent='Scraper')


allComments = open("./dataAnalytics/comments.json", "w")

#tested above

#Scrape r/programmingmemes for all comments in last 100 posts and save into a file

hotPosts = reddit.subreddit('ProgrammerHumor').hot(limit=100)
commentDic = []

postNum = 1

for post in hotPosts:
    commentList = []
    print("Working on: " + str(postNum))

    submission = reddit.submission(id=post.id)

    submission.comments.replace_more(limit=0)

    for comment in submission.comments:
        #removes unicode cha
        strEncode = comment.body.encode("ascii", "ignore")

        commentList.append({"comment": strEncode.decode()})
        
    commentDic.append({
        "postTitle": post.title,
        "Comments": commentList

    })
    print("Finished post: " + str(postNum))
    postNum += 1

final = json.dumps(commentDic, indent=4)

allComments.write(final)

allComments.close()

