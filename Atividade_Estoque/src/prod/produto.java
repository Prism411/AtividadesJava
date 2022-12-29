package prod;

public class produto {
	public String name;
	public double price;
	public int quant;

	public double totalStock() {
		return price * quant;

	}

	public void addStock(int quantd) {
		quant += quantd;

	}

	public void removeStock(int quantd) {
		quant -= quantd;

	}

		public String toString() {
		return name
		+ ", $"
		+ String.format("%.2f", price)
		+ ",  "
		+ quant 
		+ "Unidades, total: $"
		+ String.format("%.2f", totalStock());	
		}
		}