package com.model;

import java.io.Serializable;

/**
 * Model class of shopping.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Shopping implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** shoppingid. */
	private Integer shoppingid;

	/** goodsid. */
	private Integer goodsid;

	/** goodsnumber. */
	private Integer goodsnumber;

	/**
	 * Constructor.
	 */
	public Shopping() {
	}

	/**
	 * Set the shoppingid.
	 * 
	 * @param shoppingid
	 *            shoppingid
	 */
	public void setShoppingid(Integer shoppingid) {
		this.shoppingid = shoppingid;
	}

	/**
	 * Get the shoppingid.
	 * 
	 * @return shoppingid
	 */
	public Integer getShoppingid() {
		return this.shoppingid;
	}

	/**
	 * Set the goodsid.
	 * 
	 * @param goodsid
	 *            goodsid
	 */
	public void setGoodsid(Integer goodsid) {
		this.goodsid = goodsid;
	}

	/**
	 * Get the goodsid.
	 * 
	 * @return goodsid
	 */
	public Integer getGoodsid() {
		return this.goodsid;
	}

	/**
	 * Set the goodsnumber.
	 * 
	 * @param goodsnumber
	 *            goodsnumber
	 */
	public void setGoodsnumber(Integer goodsnumber) {
		this.goodsnumber = goodsnumber;
	}

	/**
	 * Get the goodsnumber.
	 * 
	 * @return goodsnumber
	 */
	public Integer getGoodsnumber() {
		return this.goodsnumber;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((shoppingid == null) ? 0 : shoppingid.hashCode());
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
		Shopping other = (Shopping) obj;
		if (shoppingid == null) {
			if (other.shoppingid != null) {
				return false;
			}
		} else if (!shoppingid.equals(other.shoppingid)) {
			return false;
		}
		return true;
	}

}