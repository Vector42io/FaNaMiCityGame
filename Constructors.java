import java.util.ArrayList;

public class Constructors {
    private String input;
    private String result=" ";
    private int countcompcity;
    private int pseudocity;
    private TextList list;
    ArrayList<String> usercities = new ArrayList<>();
    public Constructors() {
        list = new TextList();
        list.show();


    }

    public String getResult() {
        return result;
    }
    public void setInput(String inut) {
        this.input=inut;
        pseudocity=0;
        checkforvalidcity();

        checkforused();



        if (pseudocity==0){
            usercities.add(input);
            generatenewcity();
            if (countcompcity==1){
            usercities.add(result);countcompcity=0;
            }

            else {
                result="I am done";
            }System.out.println(getResult());
        }

    }
    private void checkforvalidcity(){
        if (result!=" "){
            if ((result.charAt(result.length()-1)&65503)!=input.charAt(0)){
                System.out.println("Set city begins with "+(char) (result.charAt(result.length()-1)&65503));
                pseudocity+=1;
            }}

    }
    private void checkforused(){
        if (usercities.size()>0){
            for (String citycheck: usercities){
                if (citycheck.equals(input)){
                    System.out.println("It was used. Try again!");
                    pseudocity+=1;
                    break;

                }
            }}
    }
    private void generatenewcity(){
        for (int i =0; i<list.copylist.size(); i++){
            if (list.copylist.get(i).charAt(0)==(input.charAt(input.length()-1) & 65503)){
                result=list.copylist.get(i);
                list.copylist.remove(i);
                if (list.copylist.indexOf(input)!=-1){
                    list.copylist.remove(input);
                }
                countcompcity++;
                break;
            }
        }
    }
    public void usercitiesinfo(){

        System.out.println(usercities);
    }

}