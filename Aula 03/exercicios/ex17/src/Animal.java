import java.util.EnumSet;

public class Animal {
    public String especie;
    public int idade;
    public double peso;
    public int maxEnergia;
    public int energia;

    public Animal(String especie, int idade, int peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
        this.maxEnergia = peso/idade;
        this.energia = maxEnergia;
    }

    public void acao(int custo) {
        if(energia - custo <= 0) {
            System.out.printf("%s está muito cansado para isso!\n", especie);
        }else {
            System.out.printf("%s fez uma ação!\n", especie);
            energia -= custo;
        }
    }

    public void dormir(int tempo) {
        int gainEnergia = tempo*3;
        if (energia + gainEnergia >= maxEnergia) {
            energia = maxEnergia;
        }else {
            energia += gainEnergia;
        }
        System.out.printf("%s dormiu por %d horas\n", especie, tempo);
        showEnergia();
    }

    public void comer(int kg) {
        int gainEnergia = kg * 2;
        if (energia + gainEnergia >= maxEnergia) {
            energia = maxEnergia;
        }else {
            energia += gainEnergia;
        }
        System.out.printf("%s comeu %dkg\n", especie, kg);
        showEnergia();
    }

    public void showEnergia() {
        System.out.println("Energia atual: " + energia);
    }
}
