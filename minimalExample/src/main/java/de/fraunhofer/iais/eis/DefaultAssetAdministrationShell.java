package de.fraunhofer.iais.eis;

import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Asset Administration Shell" "Describes the Administration Shell for Assets, Products,
 * Components, e.g. Machines"@en
 */

public class DefaultAssetAdministrationShell implements AssetAdministrationShell {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has Submodel" "Points from the Admin Shell to the Submodels that describe the Admin Shell of a
     * given Asset"@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
    protected List<Submodel> submodels;

    // no manual construction
    protected DefaultAssetAdministrationShell() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.submodels});
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
            DefaultAssetAdministrationShell other = (DefaultAssetAdministrationShell) obj;
            return Objects.equals(this.submodels, other.submodels);
        }
    }

    @Override
    public Object deepCopy() {
        DefaultAssetAdministrationShell other = new DefaultAssetAdministrationShell();
        other.submodels = (List<Submodel>) Util.clone(this.submodels);
        return other;
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
    final public List<Submodel> getSubmodels() {
        return submodels;
    }

    final public void setSubmodels(List<Submodel> submodels) {
        this.submodels = submodels;
    }
}
