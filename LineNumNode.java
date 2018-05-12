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
public class LineNumNode
{
private int lineNum;
private LineNumNode next;
// constructor
public LineNumNode(int lineNum, LineNumNode next)
{
this.lineNum = lineNum;
this.next = next;
}
// getters
public int getLineNum()
{
return lineNum;
}
public LineNumNode getNext()
{
return next;
}
public void setNext(LineNumNode next)
{
this.next = next;
}
}

