/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import util.Util;



/**
 *
 * @author mrcar
 */
public interface Visitor {
    
    void visit(Util u) throws Exception;
}
