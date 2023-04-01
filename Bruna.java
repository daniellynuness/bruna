import javax.swing.JOptionPane;

public class Bruna {

	public static void main(String[] args) {
		int totalDias, totalFalando, totalNamo;
		String nome;
		StringBuilder m = new StringBuilder();
		
		nome = JOptionPane.showInputDialog("Por favor, digite seu nome:");
		m.append("Isso é tudo ").append(nome).append(", não é muito mas espero que vc tenha aberto um sorrisinho, te amo!");
		
		totalDias = (27*365)+(12*30)+2;
		totalFalando = (8*30)+2;
		totalNamo = (3*30)+2;
		
		System.out.println("Oi vidona, vc sabia que até o dia de hoje você já viveu "+totalDias+" dias,\n e a gente conversa há "
		+totalFalando+" dias, porém só namoramos há "+totalNamo+" dias?? \nParace bem mais né? mas ainda bem que vai durar pra sempre! Te amo ♥");
		
		JOptionPane.showMessageDialog(null, m);

	}

}
