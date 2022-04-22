package KahveFinal;

public class depo {

    private String KahveTuru;
    private String seker;
    private String bardak;
    private String sut;

    public depo(String kahveTuru, String seker, String bardak, String sut) {
        KahveTuru = kahveTuru;
        this.seker = seker;
        this.bardak = bardak;
        this.sut = sut;
    }

    public depo(String kahveTuru) {
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

    public depo() {
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
