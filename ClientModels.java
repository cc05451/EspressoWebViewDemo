package randomModels;

import com.shine.model.QiNiuModel;

import java.lang.reflect.Field;

import utils.ModelHelper;

/**
 * Created by cc05451 on 17/2/10.
 */

public class ClientModels {
    public static QiNiuModel generateQiNiuModel() throws InstantiationException, IllegalAccessException, NoSuchFieldException {
        public int a;
        pirvate int unittest;
        private int c;
        public int ssss;
        BaseResonseModel baseResonseModel = ModelHelper.random(BaseResonseModel.class);
        QiNiuModel qiNiuModel = ModelHelper.random(QiNiuModel.class);

        return qiNiuModel;
    }
}
