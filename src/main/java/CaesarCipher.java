
public class CaesarCipher {
private StringBuffer mOutcome = new StringBuffer();
private String mOutcomeString = new String();

    public StringBuffer getmOutcome() {
        return mOutcome;
    }

    public String getmOutcomeString() {
        return mOutcomeString;
    }

    public String doCaesarCipher(String phraseForCaeserCipher, int shiftIndex){
        for (int i=0; i<phraseForCaeserCipher.length(); i++){
            if (Character.isUpperCase(phraseForCaeserCipher.charAt(i))){
              char charr = (char)(((int)phraseForCaeserCipher.charAt(i) + shiftIndex - 65)% 26 + 65);
              mOutcome.append(charr);
              mOutcomeString = mOutcome.toString();
            }
            else{
                char charr = (char)(((int)phraseForCaeserCipher.charAt(i) + shiftIndex -97)% 26 + 97);
                mOutcome.append(charr);
                mOutcomeString = mOutcome.toString();
            }
        }
        return mOutcomeString;
    }
    public String unDoCaeserCipher(String phraseForCaeserCipher, int shiftIndex){
        return doCaesarCipher(phraseForCaeserCipher, 26 - shiftIndex);
    }
}
