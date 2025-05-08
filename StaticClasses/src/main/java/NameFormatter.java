public class NameFormatter {
    private NameFormatter(){

    }
    public static String format(String firstname,String lastname){
        return lastname+", "+firstname;
    }
    public static String format(String prefix,String firstname,String middleName,String lastName,String suffix){
        return lastName+", "+prefix+", "+firstname+", " +middleName+", "+suffix;
    }
    public static String format(String fullName){
        String[]parts=fullName.split(" ");
        String prefix ="";
        String firstName="";
        String middleName="";
        String lastName="";
        String suffix="";
        if (parts.length==2){
          firstName=parts[0];
          lastName=parts[1];
          return lastName+", "+firstName;

        } else if (parts.length==4) {
            firstName=parts[0];
            middleName=parts[1];
            lastName=parts[2];
            suffix=parts[3];
            return lastName+" "+firstName+" "+middleName+", "+suffix;



        }else if (parts.length==5 ){
            prefix=parts[0];
            firstName=parts[1];
            middleName=parts[2];
            lastName=parts[3];
            suffix=parts[4];
            return lastName+" "+prefix+" "+firstName+" "+middleName+", "+suffix;

        }
        return fullName;
    }
}
