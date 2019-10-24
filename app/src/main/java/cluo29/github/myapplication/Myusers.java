package cluo29.github.myapplication;

public class Myusers {
        private String UserId="id";
        private String UserName="Name";
        private String UserEmail="Email";
        public Myusers (){

        }
        public  Myusers(String id, String username, String email){
            this.UserId = id;
            this.UserName = username;
            this.UserEmail = email;
         }

         public String getUserId() {
            return UserId;
         }
         public void setUserId(String userId) {
            UserId = userId;
         }

        public String getUserName() {
            return UserName;
        }

        public void setUserName(String userName) {
            UserName = userName;
        }

        public String getUserEmail() {
            return UserEmail;
        }

        public void setUserEmail(String userEmail) {
            UserEmail = userEmail;
        }

    @Override
    public String toString() {
        return "Myusers{" +
                "UserId='" + UserId + '\'' +
                ", UserName='" + UserName + '\'' +
                ", UserEmail='" + UserEmail + '\'' +
                '}';
    }
}
