/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.model.api;

import org.eclipse.birt.report.model.activity.SemanticException;
import org.eclipse.birt.report.model.elements.structures.DataSetParameter;

/**
 * Represents the parameter for ODA drivers. The parameter is the part of the
 * data set definition, if defined. A parameter can be an input or output
 * parameter. A parameter can also be input and output parameter. Each data set
 * parameter has the following properties:
 * 
 * <p>
 * <dl>
 * <dt><strong>Name </strong></dt>
 * <dd>a data set parameter has a required name.</dd>
 * 
 * <dt><strong>Position </strong></dt>
 * <dd>a data set parameter has an optional position for it.</dd>
 * 
 * <dt><strong>Data Type </strong></dt>
 * <dd>a data set parameter has a choice data type: any, integer, string, data
 * time, decimal, float, structure or table.</dd>
 * 
 * <dt><strong>Is optional </strong></dt>
 * <dd>whether this parameter is optional.</dd>
 * 
 * <dt><strong>Is Nullable </strong></dt>
 * <dd>whether the value of this parameter can be nullable.</dd>
 * 
 * <dt><strong>Is Input </strong></dt>
 * <dd>whether this parameter is an input parameter.</dd>
 * 
 * <dt><strong>Is Output </strong></dt>
 * <dd>whether this parameter is an output parameter.</dd>
 * </dl>
 * 
 */

public class DataSetParameterHandle extends StructureHandle
{

	/**
	 * Constructs the handle of data set parameter.
	 * 
	 * @param valueHandle
	 *            the value handle for data set parameter list of one property
	 * @param index
	 *            the position of this data set parameter in the list
	 */

	public DataSetParameterHandle( SimpleValueHandle valueHandle, int index )
	{
		super( valueHandle, index );
	}

	/**
	 * Returns the data type of this parameter. The possible values are:
	 * 
	 * <ul>
	 * <li>COLUMN_DATA_TYPE_ANY
	 * <li>COLUMN_DATA_TYPE_INTEGER
	 * <li>COLUMN_DATA_TYPE_STRING
	 * <li>COLUMN_DATA_TYPE_DATETIME
	 * <li>COLUMN_DATA_TYPE_DECIMAL
	 * <li>COLUMN_DATA_TYPE_FLOAT
	 * <li>COLUMN_DATA_TYPE_STRUCTURE
	 * <li>COLUMN_DATA_TYPE_TABLE
	 * </ul>
	 * 
	 * @return the data type of this parameter.
	 */

	public String getDataType( )
	{
		return getStringProperty( DataSetParameter.DATA_TYPE_MEMBER );
	}

	/**
	 * Sets the data type of this parameter. The allowed values are:
	 * 
	 * <ul>
	 * <li>COLUMN_DATA_TYPE_ANY
	 * <li>COLUMN_DATA_TYPE_INTEGER
	 * <li>COLUMN_DATA_TYPE_STRING
	 * <li>COLUMN_DATA_TYPE_DATETIME
	 * <li>COLUMN_DATA_TYPE_DECIMAL
	 * <li>COLUMN_DATA_TYPE_FLOAT
	 * <li>COLUMN_DATA_TYPE_STRUCTURE
	 * <li>COLUMN_DATA_TYPE_TABLE
	 * </ul>
	 * 
	 * @param dataType
	 *            the data type to set
	 * @throws SemanticException
	 *             if the value is not in the above list.
	 */

	public void setDataType( String dataType ) throws SemanticException
	{
		setProperty( DataSetParameter.DATA_TYPE_MEMBER, dataType );
	}

	/**
	 * Returns the parameter name.
	 * 
	 * @return the parameter name
	 */

	public String getName( )
	{
		return getStringProperty( DataSetParameter.NAME_MEMBER );
	}

	/**
	 * Sets the parameter name.
	 * 
	 * @param name
	 *            the name to set
	 */

	public void setName( String name )
	{
		setPropertySilently( DataSetParameter.NAME_MEMBER, name );
	}

	/**
	 * Returns the position of this parameter in parameter list.
	 * 
	 * @return the position of this parameter.
	 */

	public Integer getPosition( )
	{
		return (Integer) getProperty( DataSetParameter.POSITION_MEMBER );
	}

	/**
	 * Sets the position of this parameter in parameter list.
	 * 
	 * @param position
	 *            the position to set
	 */

	public void setPosition( Integer position )
	{
		setPropertySilently( DataSetParameter.POSITION_MEMBER, position );
	}

	/**
	 * Whether the parameter is optional.
	 * 
	 * @return whether the parameter is optional
	 */

	public boolean isOptional( )
	{
		return ( (Boolean) getProperty( DataSetParameter.IS_OPTIONAL_MEMBER ) )
				.booleanValue( );
	}

	/**
	 * Sets whether the parameter is optional.
	 * 
	 * @param value
	 *            the value to set
	 */

	public void setIsOptional( boolean value )
	{
		setPropertySilently( DataSetParameter.IS_OPTIONAL_MEMBER, Boolean
				.valueOf( value ) );
	}

	/**
	 * Sets the default value of the input parameter.
	 * 
	 * @param expr
	 *            the default value
	 */

	public void setDefaultValue( String expr )
	{
		setPropertySilently( DataSetParameter.DEFAULT_VALUE_MEMBER, expr );
	}

	/**
	 * Gets the default value of the input parameter.
	 * 
	 * @return the default value
	 */

	public String getDefaultValue( )
	{
		return (String) getProperty( DataSetParameter.DEFAULT_VALUE_MEMBER );
	}

	/**
	 * Checks whether this parameter is an input parameter.
	 * 
	 * @return <code>true</code> if it is an input parameter. Otherwise
	 *         <code>false</code>.
	 */

	public boolean isInput( )
	{
		return ( (Boolean) getProperty( DataSetParameter.IS_INPUT_MEMBER ) )
				.booleanValue( );
	}

	/**
	 * Sets whether this parameter is an input parameter.
	 * 
	 * @param isInput
	 *            <code>true</code> if it is an input parameter. Otherwise
	 *            <code>false</code>.
	 */

	public void setIsInput( boolean isInput )
	{
		setPropertySilently( DataSetParameter.IS_INPUT_MEMBER, Boolean
				.valueOf( isInput ) );
	}

	/**
	 * Checks whether the value of this parameter can be <code>null</code>.
	 * 
	 * @return <code>true</code> if the value can be <code>null</code>.
	 *         Otherwise <code>false</code>.
	 */

	public boolean isNullable( )
	{
		return ( (Boolean) getProperty( DataSetParameter.IS_NULLABLE_MEMBER ) )
				.booleanValue( );
	}

	/**
	 * Checks whether the value of this parameter can be <code>null</code>.
	 * 
	 * @return <code>true</code> if the value can be <code>null</code>.
	 *         Otherwise <code>false</code>.
	 *         
	 * @deprecated by {@link #isNullable()}
	 */

	public boolean getIsNullable( )
	{
		return isNullable( );
	}

	/**
	 * Sets whether the value of this parameter can be <code>null</code>.
	 * 
	 * @param isNullable
	 *            <code>true</code> if the value can be <code>null</code>.
	 *            Otherwise <code>false</code>.
	 */

	public void setIsNullable( boolean isNullable )
	{
		setPropertySilently( DataSetParameter.IS_NULLABLE_MEMBER, Boolean
				.valueOf( isNullable ) );
	}

	/**
	 * Checks whether this parameter is an output parameter.
	 * 
	 * @return <code>true</code> if it is an output parameter. Otherwise
	 *         <code>false</code>.
	 */

	public boolean isOutput( )
	{
		return ( (Boolean) getProperty( DataSetParameter.IS_OUTPUT_MEMBER ) )
				.booleanValue( );
	}

	/**
	 * Sets whether this parameter is an output parameter.
	 * 
	 * @param isOutput
	 *            <code>true</code> if it is an output parameter. Otherwise
	 *            <code>false</code>.
	 */

	public void setIsOutput( boolean isOutput )
	{
		setPropertySilently( DataSetParameter.IS_OUTPUT_MEMBER, Boolean
				.valueOf( isOutput ) );
	}
}