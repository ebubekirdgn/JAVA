
public class GetterSetter 
{
	private String adi;
	private int yasi;
	

	public String getAdi() 
	{
		return adi;
	}
	public void setAdi(String adi) 
	{
		this.adi = adi;
	}
	public int getYasi() 
	{
		return yasi;
	}
	public void setYasi(int yasi) 
	{
		this.yasi = yasi;
	}
	public GetterSetter(String adi, int yasi) {
		 setAdi(adi);
		 setYasi(yasi);
	}
	
	public static void main(String[] args)
	{
	 GetterSetter gs = new GetterSetter("Ebubekir",23);
	 System.out.println("Adý : " + gs.getAdi());
	 System.out.println("Yaþý : " + gs.getYasi());
	}

}
