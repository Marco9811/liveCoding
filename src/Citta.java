public class Citta {
    private Integer numeroAbitanti;
    private String name;
    private CittaTypeEnum typeEnum;
    private CitySizeEnum cittaSize;

    public Citta(Integer numeroAbitanti, String name, CittaTypeEnum typeEnum) {
        this.numeroAbitanti = numeroAbitanti;
        this.name = name;
        this.typeEnum = typeEnum;
        this.cittaSize = cittaSize;
    }

    public Integer getNumeroAbitanti() {
        return numeroAbitanti;
    }

    public void setNumeroAbitanti(Integer numeroAbitanti) {
        this.numeroAbitanti = numeroAbitanti;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CittaTypeEnum getTypeEnum() {
        return typeEnum;
    }

    public void setTypeEnum(CittaTypeEnum typeEnum) {
        this.typeEnum = typeEnum;
    }

    public void stampaInfo() {
        System.out.println("Il numero degli abitanti:" + " " + numeroAbitanti + ",della citta:" + " " + numeroAbitanti
                + " ,situata:" + " " + typeEnum + ",la citta e :" + " "+ cittaSize);
    }

    public CitySizeEnum assignCitySizeEnum(Citta citta) {
        if (this.numeroAbitanti > 0 && this.numeroAbitanti <= 10000) {
            return CitySizeEnum.SMALL;}
        if(this.numeroAbitanti > 10000 && this.numeroAbitanti <= 20000) {
            return CitySizeEnum.NORMAL;}
            return CitySizeEnum.BIG;}
    }

