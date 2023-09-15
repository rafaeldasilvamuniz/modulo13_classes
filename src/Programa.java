public class Programa {

    public static void main(String args[]){

        Pessoa pe = new PF();
        pe.setTelefone("9999-99999");
        pe.setEndereco("Rua Fulano de tal.");
        pe.setNome("Testando Testando Testando");

        PF pessoaFisica = new PF();
        pessoaFisica.setCpf("099.999.999-99");

        PJ pessoaJuridica = new PJ();

        pessoaJuridica.setCnpj("999 999 999 999 999");

        System.out.println("Nome: " + pe.getNome() + ";" + "Endereço: " + pe.getEndereco() + ";" +
                "Telefone: " + pe.getTelefone() + ";" + "CPF : " + pessoaFisica.getCpf() + ";" + "CNPJ: " + pessoaJuridica.getCnpj() + ";");



    }
}
