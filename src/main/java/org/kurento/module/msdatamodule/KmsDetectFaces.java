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
public interface KmsDetectFaces extends Filter {


    



    public class Builder extends AbstractBuilder<KmsDetectFaces> {

/**
 *
 * Creates a Builder for KmsDetectFaces
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline){

      super(KmsDetectFaces.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
    }

    }


}