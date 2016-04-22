/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.module.msdatamodule;

import org.kurento.client.*;

/**
 *
 * KmsDetectFaces interface. Documentation about the module
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface KmsSGD extends Filter {


    



    public class Builder extends AbstractBuilder<KmsSGD> {

/**
 *
 * Creates a Builder for KmsSGD
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline){

      super(KmsSGD.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
    }

    }


}