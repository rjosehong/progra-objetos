public class Saldo {
    private int saldo_inicial = 16;
    private int saldos;

    public int getSaldoInicial(){
        return saldo_inicial;
    }
    public int getSaldos(){
        saldos = saldos+=saldo_inicial;
        return saldos;
    }
}