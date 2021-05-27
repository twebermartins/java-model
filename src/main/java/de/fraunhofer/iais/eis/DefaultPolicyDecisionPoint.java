package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Policy Decision Point" "Defines a security policy decision point (PDP). "@en
 */

public class DefaultPolicyDecisionPoint implements PolicyDecisionPoint {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "is external policy decision point defined" "If externalPolicyDecisionPoints True then Endpoints
     * to external available decision points taking into consideration for access control for the AAS
     * need to be configured."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyDecisionPoint/externalPolicyDecisionPoints")
    protected List<Boolean> externalPolicyDecisionPoints;

    // no manual construction
    protected DefaultPolicyDecisionPoint() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.externalPolicyDecisionPoints});
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
            DefaultPolicyDecisionPoint other = (DefaultPolicyDecisionPoint) obj;
            return Objects.equals(this.externalPolicyDecisionPoints, other.externalPolicyDecisionPoints);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultPolicyDecisionPoint other = new DefaultPolicyDecisionPoint();
        other.externalPolicyDecisionPoints = (List<Boolean>) Util.clone(this.externalPolicyDecisionPoints);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyDecisionPoint/externalPolicyDecisionPoints")
    final public List<Boolean> getExternalPolicyDecisionPoints() {
        return externalPolicyDecisionPoints;
    }

    final public void setExternalPolicyDecisionPoints(List<Boolean> externalPolicyDecisionPoints) {
        this.externalPolicyDecisionPoints = externalPolicyDecisionPoints;
    }
}
