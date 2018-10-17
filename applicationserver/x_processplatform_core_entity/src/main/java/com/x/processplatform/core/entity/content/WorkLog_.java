/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.processplatform.core.entity.content;

import com.x.base.core.entity.SliceJpaObject_;
import com.x.processplatform.core.entity.element.ActivityType;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.processplatform.core.entity.content.WorkLog.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Sun Sep 02 18:44:03 CST 2018")
public class WorkLog_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<WorkLog,String> application;
    public static volatile SingularAttribute<WorkLog,String> applicationAlias;
    public static volatile SingularAttribute<WorkLog,String> applicationName;
    public static volatile SingularAttribute<WorkLog,String> arrivedActivity;
    public static volatile SingularAttribute<WorkLog,String> arrivedActivityAlias;
    public static volatile SingularAttribute<WorkLog,String> arrivedActivityName;
    public static volatile SingularAttribute<WorkLog,String> arrivedActivityToken;
    public static volatile SingularAttribute<WorkLog,ActivityType> arrivedActivityType;
    public static volatile SingularAttribute<WorkLog,Date> arrivedTime;
    public static volatile SingularAttribute<WorkLog,Boolean> completed;
    public static volatile SingularAttribute<WorkLog,Boolean> connected;
    public static volatile SingularAttribute<WorkLog,Long> duration;
    public static volatile SingularAttribute<WorkLog,String> fromActivity;
    public static volatile SingularAttribute<WorkLog,String> fromActivityAlias;
    public static volatile SingularAttribute<WorkLog,String> fromActivityName;
    public static volatile SingularAttribute<WorkLog,String> fromActivityToken;
    public static volatile SingularAttribute<WorkLog,ActivityType> fromActivityType;
    public static volatile SingularAttribute<WorkLog,Date> fromTime;
    public static volatile SingularAttribute<WorkLog,String> id;
    public static volatile SingularAttribute<WorkLog,String> job;
    public static volatile SingularAttribute<WorkLog,String> process;
    public static volatile SingularAttribute<WorkLog,String> processAlias;
    public static volatile SingularAttribute<WorkLog,String> processName;
    public static volatile SingularAttribute<WorkLog,String> route;
    public static volatile SingularAttribute<WorkLog,String> routeName;
    public static volatile SingularAttribute<WorkLog,String> splitToken;
    public static volatile ListAttribute<WorkLog,String> splitTokenList;
    public static volatile SingularAttribute<WorkLog,String> splitValue;
    public static volatile SingularAttribute<WorkLog,Boolean> splitting;
    public static volatile SingularAttribute<WorkLog,String> work;
    public static volatile SingularAttribute<WorkLog,String> workCompleted;
}