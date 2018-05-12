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
public class SymbolTable {

    private IdentifierHeaderNode[] table;

    public SymbolTable() {
        table = new IdentifierHeaderNode[50];
        initTable(table);
    }

    public void add(String identifier, int line_num) {
        int row;
        row = findIdentifier(identifier);
        LineNumNode temp;

        if (row == -1) {
            row = nextAvailRow();
            table[row] = new IdentifierHeaderNode(identifier, new LineNumNode(line_num, null));
        } else {
            temp = table[row].getNext();
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new LineNumNode(line_num, null));
        }
    }

    private int findIdentifier(String ident) {
        int i = 0;
        while (table[i] != null) {
            if (table[i].getIdentifier().equals(ident)) {
                return i;
            }
            i = i + 1;
        }
        return -1;
    }

    private int nextAvailRow() {
        int i = 0;
        while (table[i] != null) {
            i = i + 1;
        }
        return i;
    }

    private void initTable(IdentifierHeaderNode[] table) {
        for (int i = 0; i < 50; i++) {
            table[i] = null;
        }
    }

    public void display() {
        LineNumNode temp;
        int i = 0;

        while (table[i] != null) {
            System.out.print(table[i].getIdentifier());
            System.out.print(" ");
            temp = table[i].getNext();
            while (temp != null) {
                System.out.println(temp.getLineNum());
                System.out.print("");
                temp = temp.getNext();
            }
            i++;
            System.out.println();
        }
    }

}
