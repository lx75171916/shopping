package com.model;

import java.io.Serializable;

/**
 * Model class of goodstype.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Goodstype implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** typeid. */
	private Integer typeid;

	/** typename. */
	private String typename;

	/**
	 * Constructor.
	 */
	public Goodstype() {
	}

	/**
	 * Set the typeid.
	 * 
	 * @param typeid
	 *            typeid
	 */
	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	/**
	 * Get the typeid.
	 * 
	 * @return typeid
	 */
	public Integer getTypeid() {
		return this.typeid;
	}

	/**
	 * Set the typename.
	 * 
	 * @param typename
	 *            typename
	 */
	public void setTypename(String typename) {
		this.typename = typename;
	}

	/**
	 * Get the typename.
	 * 
	 * @return typename
	 */
	public String getTypename() {
		return this.typename;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((typeid == null) ? 0 : typeid.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Goodstype other = (Goodstype) obj;
		if (typeid == null) {
			if (other.typeid != null) {
				return false;
			}
		} else if (!typeid.equals(other.typeid)) {
			return false;
		}
		return true;
	}

}