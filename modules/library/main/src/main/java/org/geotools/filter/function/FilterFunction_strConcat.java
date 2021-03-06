package org.geotools.filter.function;

/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 * 
 *    (C) 2005-2008, Open Source Geospatial Foundation (OSGeo)
 *    
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */

//this code is autogenerated - you shouldnt be modifying it!
import org.geotools.filter.FunctionExpression;
import org.geotools.filter.FunctionExpressionImpl;

public class FilterFunction_strConcat extends FunctionExpressionImpl implements FunctionExpression {

    public FilterFunction_strConcat() {
        super("strConcat");
    }

    public int getArgCount() {
        return 2;
    }

    public Object evaluate(Object feature) {
        String arg0;
        String arg1;

        try {
            // attempt to get value and perform conversion
            arg0 = (String) getExpression(0).evaluate(feature, String.class);
        } catch (Exception e) // probably a type error
        {
            throw new IllegalArgumentException(
                    "Filter Function problem for function strConcat argument #0 - expected type String");
        }

        try { // attempt to get value and perform conversion
            arg1 = (String) getExpression(1).evaluate(feature, String.class); 
        } catch (Exception e) // probably a type error
        {
            throw new IllegalArgumentException(
                    "Filter Function problem for function strConcat argument #1 - expected type String");
        }

        return (StaticGeometry.strConcat(arg0, arg1));
    }
}
