 package menuitems;
 
 
public class ThisIsPojo
{
	/*
	 
	CREATE TABLE IF NOT EXISTS Clients (
	    id INT AUTO_INCREMENT PRIMARY KEY,
	    firstName VARCHAR(255) NOT NULL,
	    lastName VARCHAR(255) NOT NULL,
	    phoneNumber VARCHAR(20) NOT NULL,
	    classTime ENUM('9:30 AM', '6:00 PM') NOT NULL
	);


	INSERT INTO Clients (firstName, lastName, phoneNumber, classTime) VALUES
	('John', 'Doe', '555-1234', '9:30 AM'),
	('Jane', 'Smith', '555-5678', '6:00 PM');
	('bobo' , 'jake') '555-44-5555' '5:00');
	  */
	
	
private String Client;
private String Phonenumber;
private String time;
public String getClient() {
	return Client;
}

public ThisIsPojo() {}; 

public void setClient(String client) {
	Client = client;
}
public String getPhonenumber() {
	return Phonenumber;
}
public void setPhonenumber(String phonenumber) {
	Phonenumber = phonenumber;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Client == null) ? 0 : Client.hashCode());
	result = prime * result + ((Phonenumber == null) ? 0 : Phonenumber.hashCode());
	result = prime * result + ((time == null) ? 0 : time.hashCode());
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
	ThisIsPojo other = (ThisIsPojo) obj;
	if (Client == null) {
		if (other.Client != null)
			return false;
	} else if (!Client.equals(other.Client))
		return false;
	if (Phonenumber == null) {
		if (other.Phonenumber != null)
			return false;
	} else if (!Phonenumber.equals(other.Phonenumber))
		return false;
	if (time == null) {
		if (other.time != null)
			return false;
	} else if (!time.equals(other.time))
		return false;
	return true;
}
	
	
}
