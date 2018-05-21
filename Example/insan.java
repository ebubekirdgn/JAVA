public class insan{
	private String adi;
	private String soyadi;
	private int yasi;

	public insan(String adi, String soyadi, int yasi){
		this.adi = adi;
		this.soyadi = soyadi;

	}
	
	public void setAdi(String adi){
		this.adi = adi;
	}
	
	public void setSoyadi(String soyadi){
		this.soyadi= soyadi;
	}
	public void setYasi(String yasi){
		this.yasi = yasi;
	}

	public String getAdi(void){
		return this.adi;
	}
	
	public String getSoyadi(void){
		return this.soyadi;
	}
	public int getYasi(void){
		return this.yasi;
	}

	
}