package test;

import java.util.Hashtable;

public class SaveScore {
    Hashtable<Integer, String> my_dict = new Hashtable<Integer, String>();
    String tempname = "";
    int tempscore = 0;
public SaveScore()
{

}
    public Hashtable<Integer, String> CallSaveScore() {


        return my_dict;
    }

    public Hashtable<Integer, String> InsertSaveScore(String pname, int score) {
        my_dict.put(score, pname);
        return my_dict;
    }

    public void SaveScorename(String pname) {


        tempname = pname;


    }



    public int TempSaveScore(int sc, String fd, String gg) {

        tempscore +=sc ;

        return tempscore;
    }
}



