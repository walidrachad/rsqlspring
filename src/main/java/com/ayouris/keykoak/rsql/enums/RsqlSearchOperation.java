package com.ayouris.keykoak.rsql.enums;

import cz.jirutka.rsql.parser.ast.ComparisonOperator;
import cz.jirutka.rsql.parser.ast.RSQLOperators;

/**
 * 
 * @author ITROAD
 *
 * Equal to : ==
 * Not equal to : !=
 * Less than : =lt= or <
 * Less than or equal to : =le= or <=
 * Greater than operator : =gt= or >
 * Greater than or equal to : =ge= or >=
 * In : =in=
 * Not in : =out=
 */

public enum RsqlSearchOperation  {
    EQUAL(RSQLOperators.EQUAL), 
    NOT_EQUAL(RSQLOperators.NOT_EQUAL), 
    GREATER_THAN(RSQLOperators.GREATER_THAN), 
    GREATER_THAN_OR_EQUAL(RSQLOperators.GREATER_THAN_OR_EQUAL), 
    LESS_THAN(RSQLOperators.LESS_THAN), 
    LESS_THAN_OR_EQUAL(RSQLOperators.LESS_THAN_OR_EQUAL), 
    IN(RSQLOperators.IN), 
    NOT_IN(RSQLOperators.NOT_IN);
 
    private ComparisonOperator operator;
 
    private RsqlSearchOperation(ComparisonOperator operator) {
        this.operator = operator;
    }
 
    public static RsqlSearchOperation getSimpleOperator(ComparisonOperator operator) {
        for (RsqlSearchOperation operation : values()) {
            if (operation.operator == operator) {
                return operation;
            }
        }
        return null;
    }
}