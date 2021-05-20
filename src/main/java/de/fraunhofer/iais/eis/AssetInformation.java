package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Asset Information" "The asset may either represent an asset type or an asset instance. The asset
 * has a globally unique identifier plus - if needed - additional domain specific (proprietary)
 * identifiers. However, to support the corner case of very first phase of lifecycle where a
 * stabilised/constant global asset identifier does not already exist, the corresponding attribute
 * \'globalAssetId\' is optional."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAssetInformation.class)
})
public interface AssetInformation extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Denotes whether the Asset of kind \'Type\' or \'Instance\'."@en
     * 
     * @return Returns the AssetKind for the property assetKind. More information under
     *         https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/assetKind")
    public AssetKind getAssetKind();

    /**
     * "Reference to either an Asset object or a global reference to the asset the AAS is representing.
     * This attribute is required as soon as the AAS is exchanged via partners in the life cycle of the
     * asset. In a first phase of the life cycle the asset might not yet have a global id but already an
     * internal identifier. The internal identifier would be modelled via \'externalAssetId\'."@en
     * "Constraint AASd-023: AssetInformation/globalAssetId either is a reference to an Asset object or
     * a global reference."@en
     * 
     * @return Returns the Reference for the property globalAssetId. More information under
     *         https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/globalAssetId")
    public Reference getGlobalAssetId();

    /**
     * "Additional domain-specific, typically proprietary Identifier for the asset like e.g. serial
     * number etc."@en
     * 
     * @return Returns the List of IdentifierKeyValuePairs for the property specificAssetIds. More
     *         information under https://admin-shell.io/aas/3/0/RC01/AssetInformation/specificAssetId
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/specificAssetId")
    public List<IdentifierKeyValuePair> getSpecificAssetIds();

    /**
     * "A reference to a Submodel that defines the bill of material of the asset represented by the AAS.
     * This submodel contains a set of entities describing the material used to compose the composite
     * I4.0 Component."@en
     * 
     * @return Returns the List of Submodels for the property billOfMaterials. More information under
     *         https://admin-shell.io/aas/3/0/RC01/AssetInformation/billOfMaterial
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/billOfMaterial")
    public List<Submodel> getBillOfMaterials();

    /**
     * "Thumbnail of the asset represented by the asset administration shell."@en
     * 
     * @return Returns the File for the property defaultThumbnail. More information under
     *         https://admin-shell.io/aas/3/0/RC01/AssetInformation/defaultThumbnail
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetInformation/defaultThumbnail")
    public File getDefaultThumbnail();

}
