public class Covid19Data {

    String region;
    String aldersGruppe;
    int bekræftedeTilfældeTotalt;
    int døde;
    int indlagteIntensivAfdeling;
    int indlagte;
    String dato;


    public Covid19Data(String region, String aldersGruppe, int bekræftedeTilfældeTotalt,
                       int døde, int indlagteIntensivAfdeling, int indlagte, String dato) {
        this.region = region;
        this.aldersGruppe = aldersGruppe;
        this.bekræftedeTilfældeTotalt = bekræftedeTilfældeTotalt;
        this.døde = døde;
        this.indlagteIntensivAfdeling = indlagteIntensivAfdeling;
        this.indlagte = indlagte;
        this.dato = dato;
    }


    @Override
        public String toString(){
            return "Covid19Data{" +
                    " region: " + region +
                    " aldersgruppe: " + aldersGruppe +
                    " bekræftede tilfælde totalt: " + bekræftedeTilfældeTotalt +
                    " døde: " + døde +
                    " indlagte på intensiv afdeling: " + indlagteIntensivAfdeling +
                    " indlagte: " + indlagte +
                    " dato: " + dato;
        }
}

