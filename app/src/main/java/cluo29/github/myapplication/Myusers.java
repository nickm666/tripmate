package cluo29.github.myapplication;

import java.util.ArrayList;

public class Myusers {
        private String UserId="id";
        private String UserName="Name";
        private String UserEmail="Email";
        private String coverage="coverage";
        private ArrayList<Integer> preferedEventsType = new ArrayList<Integer>();
        private ArrayList<Integer> preferedPlacesType = new ArrayList<Integer>();
        public Myusers (){

        }
        public  Myusers(String id, String username, String email){
            this.UserName = username;
            this.UserEmail = email;
            UserId=id;
         }

        public String getCoverage() {
            return coverage;
        }

        public void setCoverage(String coverage) {
            this.coverage = coverage;
        }

         public ArrayList<Integer> getPreferedEventsType() {
            return preferedEventsType;
        }

        public void setPreferedEventsType(ArrayList<Integer> preferedEventsType) {
            this.preferedEventsType = preferedEventsType;
        }

        public ArrayList<Integer> getPreferedPlacesType() {
            return preferedPlacesType;
        }

        public void setPreferedPlacesType(ArrayList<Integer> preferedPlacesType) {
            this.preferedPlacesType = preferedPlacesType;
        }
        public void updateSettings(String coverage, Integer events, Integer places) {
            setCoverage(coverage);
            addPreferedEventsType(events);
            addPreferedPlacesType(places);
        }
        public void addPreferedEventsType(Integer events) {
            preferedEventsType.add(events);
        }

        public void removePreferedEventsType(Integer events) {
            preferedEventsType.remove(events);
        }

        public void addPreferedPlacesType(Integer places) {
            preferedPlacesType.add(places);
        }

        public void removePreferedPlacesType(Integer places) {
            preferedPlacesType.remove(places);
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
