package example.designPatterns.mediator;

public class concreteMediator implements Mediator{
    String email;
    String password;
    String page;


    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setPassword(String password) {
        this.password = password; 
        
    }

    @Override
    public void setPage(String page) {
        this.page = page;
        
    }

    public String authenticate(){
        String result;
        if(email == null){
            return "No email provided";
        }
        else if(password == null){
            return "No password provided";
        }

        if(page == "Login"){
            return sendCredientials(email,password);
        }
        else if(page == "Register"){
            return registerCredentials(email,password);
        }


        return "No page provided";    
            
        }
    }
    
