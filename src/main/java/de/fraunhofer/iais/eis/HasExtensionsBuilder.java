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

public class HasExtensionsBuilder {

	private DefaultHasExtensions defaultHasExtensions;

	public HasExtensionsBuilder() {
		defaultHasExtensions = new DefaultHasExtensions();
	}

	public HasExtensionsBuilder(URI id) {
		this();
		defaultHasExtensions.id = id;
	}

	/**
	* This function allows setting a value for extensions
	* @param extensions desired value to be set
	* @return Builder object with new value for extensions
	*/
	final public HasExtensionsBuilder extensions(List<Extension> extensions) {
		this.defaultHasExtensions.extensions = extensions;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public HasExtensions build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultHasExtensions);
		return defaultHasExtensions;
	}
}
