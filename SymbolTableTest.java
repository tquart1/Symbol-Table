/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package symboltable;

/**
 *
 * @author tquart1
 */
public class SymbolTableTest {
    private IdentifierHeaderNode[] table;
public static void main(String[] args){
		SymbolTable table = new SymbolTable();
                System.out.println("Symbol Table: ");
		table.add("n",10);
		table.add("k", 15);
		table.add("n",20);
		table.add("sum",25);
		table.add("k",36);
		table.display();
	}
	private void display() {
		int i=0;
		while(table[i]!=null)
		{
                   
			System.out.print(table[i].getIdentifier()+ " ");
                        System.out.println(table[i].getNext().getLineNum());
			i++;
		}
	}
}
	