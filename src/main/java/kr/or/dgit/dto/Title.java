package kr.or.dgit.dto;

public class Title {
	String pNo;
	String pName;
	
	
	public Title() {}
	
	public String getpNo() {
		return pNo;
	}
	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}

	@Override
	public String toString() {
		return String.format("%s", pName);
	}

	public Title(String pNo, String pName) {
		this.pNo = pNo;
		this.pName = pName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pNo == null) ? 0 : pNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Title other = (Title) obj;
		if (pNo == null) {
			if (other.pNo != null)
				return false;
		} else if (!pNo.equals(other.pNo))
			return false;
		return true;
	}
	
	
}	
