package oops;

public class ExecuteLevel {
    public static void main(String[] args) {
        Instagram insta = new Instagram();
        insta.email="razzaksr@gmail.com";
        insta.password="razak123";
        insta.phoneNumber=9876543210L;
        insta.friendList = new String[]{"Alice","Bob","Charlie"};
        insta.reels = new String[]{"TravelVlog","TechReview","FoodieFun"};

        GoogleDrive drive = new GoogleDrive();
        drive.email="razaksrmd@gmail.com";
        drive.password="drive123";
        drive.phoneNumber=9123456780L;
        drive.storagePlan="Premium 2TB";
    }
}
class Google{
    String email;
    String password;
    long phoneNumber;
}
class GoogleDrive extends Google{
    String storagePlan;
    public void showStoragePlan(){
        System.out.println("Storage Plan is "+storagePlan);
    }
}
class Facebook extends Google{
    String friendList[];
    public void showFriends(){
        for(String friend : friendList){
            System.out.println(friend);
        }
    }
}
class Instagram extends Facebook{
    String reels[];
    public void showReels(){
        for(String reel : reels){
            System.out.println(reel);
        }
    }
}