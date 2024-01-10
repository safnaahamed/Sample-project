package javasampleproject;

public class MultilevelClass3 extends MultilevelClass2 {

	public void totalSalary() {
		double total = bp + hra + pf + ded + bonus;
		System.out.println("Total Salary : " + total);

	}

	public static void main(String[] args) {
		MultilevelClass3 mc3 = new MultilevelClass3();
		mc3.salaryOfEmp();
		mc3.allowance();
		mc3.totalSalary();
		System.out.println("Basic pay : " + mc3.bp);
		System.out.println("Deduction : " + mc3.ded);
		System.out.println("HRA : " + mc3.hra);
		System.out.println("PF : " + mc3.pf);
		System.out.println("Bonus : " + mc3.bonus);
		System.out.println("Salary in hand : " + mc3.salary);

	}

}
