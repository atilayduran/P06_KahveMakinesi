package KahveFinal;

public class Depo {

    private String KahveTuru;
    private String seker;
    private String bardak;
    private String sut;


    public Depo(String kahveTuru) {
        KahveTuru = kahveTuru;
    }

    public String getKahveTuru() {
        return KahveTuru;
    }

    public void setKahveTuru(String kahveTuru) {
        KahveTuru = kahveTuru;
    }

    public String getSeker() {
        return seker;
    }

    public void setSeker(String seker) {
        this.seker = seker;
    }

    public String getBardak() {
        return bardak;
    }

    public void setBardak(String bardak) {
        this.bardak = bardak;
    }

    public String getSut() {
        return sut;
    }

    public void setSut(String sut) {
        this.sut = sut;
    }

    public Depo() {
    }

    @Override
    public String toString() {
        return "depo{" +
                "KahveTuru='" + KahveTuru + '\'' +
                ", seker='" + seker + '\'' +
                ", bardak='" + bardak + '\'' +
                ", sut='" + sut + '\'' +
                '}';
    }
}
