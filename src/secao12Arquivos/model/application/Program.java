package secao12Arquivos.model.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

import secao12Arquivos.model.entities.Item;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String string = "C:\\Users\\Wagner\\Desktop\\ws-eclipse\\course\\bin\\secao12Arquivos\\model\\application"; // local do arquivo

		new File(string + "\\out").mkdir(); // cria um subdiretório

		try (FileReader fr = new FileReader(string + "\\in.csv");
				BufferedReader in = new BufferedReader(fr);
				BufferedWriter out = new BufferedWriter(new FileWriter(string + "\\out\\summary.csv"))) { // arquivo de saída

			String line = in.readLine();

			while (line != null) {

				String lines[] = line.split(",");

				String name = lines[0];
				double price = Double.parseDouble(lines[1]);
				int quantity = Integer.parseInt(lines[2]);

				Item item = new Item(name, price, quantity);

				out.write(item.getName() + ", " + item.total());
				out.newLine();

				line = in.readLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
