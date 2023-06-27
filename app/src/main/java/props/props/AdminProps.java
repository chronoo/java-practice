package props.props;

import props.Category;
import props.Props;
import props.Service;
import props.annotation.ConfigServiceProperty;
import props.annotation.LegacyProperty;

public enum AdminProps implements Props {
    @ConfigServiceProperty(key = "first", service = Service.CORE_APP)
    @LegacyProperty(key = "com.props.first", category = Category.CORE)
    FIRST,

    @ConfigServiceProperty(key = "second", service = Service.ADMIN_SERVICE)
    @LegacyProperty(key = "com.props.second", category = Category.LOG)
    SECOND,

    @ConfigServiceProperty(key = "third", service = Service.CORE_APP)
    @LegacyProperty(key = "com.props.third", category = Category.API)
    THIRD
}

