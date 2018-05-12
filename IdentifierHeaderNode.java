/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package symboltable;

/**
 *
 * @author user
 */
/**
 *
 * @author tquart1
 */
public class IdentifierHeaderNode
{
private String identifier;
private LineNumNode next;
// constructor
public IdentifierHeaderNode(String identifier, LineNumNode next)
{
this.identifier = identifier;
this.next = next;
}
// getters
public String getIdentifier()
{
return identifier;
}
public LineNumNode getNext()
{
return next;
}
// setters
public void setNext(LineNumNode next)
{
this.next = next;
}
}