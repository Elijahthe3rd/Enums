public class Test {
    Levels userRights;
    public  Test( Levels userRights) {
        this.userRights = userRights;
    }
    public String checkUserRightsLevel() {
        String result="";
        switch(userRights) {
            case ZERO:
                result= new String("You have zero rights to Write,execute but view only");
                break;
            case ONE:
                result = new String("You have zero rights to Write & execute but only 1 to VIEW/READ");
                break;
            case TWO:
                result= new String("You have rights to Write,execute, you can add or update new or assistant technician,assets specs into the system");
                break;
            case SUPERUSER:
                result= new String("You have All access rights to READ WRITE EXECUTE,you can add or update new or old technician,assets into the system; can assign assets to recruits");
                break;
            default:
                result= new String("I don't know which rights of ACCESS DO YOU POSSES.");
                break;
        }
        return result;
    }
}