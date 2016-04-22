/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.module.msdatamodule;

import org.kurento.client.*;

/**
 *
 * KmsCharter interface. Documentation about the module
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface KmsCharter extends Filter {


    



    public class Builder extends AbstractBuilder<KmsCharter> {

/**
 *
 * Creates a Builder for KmsCharter
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline){

      super(KmsCharter.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
    }

    }


}