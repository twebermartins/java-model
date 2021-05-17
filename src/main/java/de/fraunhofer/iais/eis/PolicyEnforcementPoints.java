package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
* "Policy Enforcement Point"
* "Defines the security policy enforcement points (PEP)."@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultPolicyEnforcementPoints.class)
})
public interface PolicyEnforcementPoints extends ModelClass {

	// standard methods

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "If externalPolicyEnforcementPoint True then an Endpoint to external available enforcement point taking needs to be configured for the AAS."@en
	* @return Returns the boolean for the property externalPolicyEnforcementPoint.
	* More information under https://admin-shell.io/aas/3/0/RC01/PolicyEnforcementPoints/externalPolicyEnforcementPoint
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/PolicyEnforcementPoints/externalPolicyEnforcementPoint")
	public boolean getExternalPolicyEnforcementPoint();

}
