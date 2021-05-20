package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Formula"
 */

public class DefaultFormula implements Formula {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "depends on" "A formula may depend on referable or even external global elements - assumed that
     * can be referenced and their value may be evaluated - that are used in the logical expression."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Formula/dependsOn")
    protected List<Reference> dependsOns;

    // no manual construction
    protected DefaultFormula() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.dependsOns});
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultFormula other = (DefaultFormula) obj;
            return Objects.equals(this.dependsOns, other.dependsOns);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultFormula other = new DefaultFormula();
        other.dependsOns = (List<Reference>) Util.clone(this.dependsOns);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/Formula/dependsOn")
    final public List<Reference> getDependsOns() {
        return dependsOns;
    }

    final public void setDependsOns(List<Reference> dependsOns) {
        this.dependsOns = dependsOns;
    }

}
