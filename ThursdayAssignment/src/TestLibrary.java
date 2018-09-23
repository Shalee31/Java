
public class TestLibrary {

	public static void main(String[] args) {
		
		Book b = new Book ("The Alchemist");
		Book b1 = new Book ("Gone Girl");
		Member m = new Member("Harry");
		Member m1 = new Member("Ron");
		b.status();
		m.status();
		
		b.issueBook(m);//issuing bk
		b.issueBook(m1);//not get bk as already issued
		b.returnBook(m);//returning bk
		b.returnBook(m1);//return bk when not issued
		b.returnBook(m);//return bk after returning
		
		b.issueBook(m);
		b1.issueBook(m1);
		b.returnBook(m1);//not same bk issued nd returned
		
	}

}
