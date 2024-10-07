package modell;

public class KonzolModell {
    
    private Ember[] emberek;

    public KonzolModell() {
        emberek = new Ember[3];
        // Ha a születésnap true, akkor volt már idén születésnapja, ha false, akkor még nem.
        emberek[0] = new Ember("Jani", 20, "angol", false);
        emberek[1] = new Ember("Ubul", 23, "német", true);
        emberek[2] = new Ember("Juli", 29, "spanyol", true);
    }
    
    public String bemutatkozas(){
        String s = "";
        int i = 1;
        for (Ember ember : emberek) {
            String nev = ember.getNev();
            int kor = 0;
            if(ember.isSzuletesnap()){
                kor= ember.getKor()+1;
            }
            else{
                kor=ember.getKor();
            }
            String nyelv = ember.getNyelv();
            s+= i++ +". "+"A nevem "+nev+", "+kor+" éves vagyok, "+nyelv+" nyelven is beszélek.\n";
        }
        return s;
    }
}
