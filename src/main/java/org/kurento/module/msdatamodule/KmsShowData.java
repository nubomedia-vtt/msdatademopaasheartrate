/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.module.msdatamodule;

import org.kurento.client.*;

/**
 *
 * KmsShowData interface. Documentation about the module
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface KmsShowData extends MediaElement {


    



    public class Builder extends AbstractBuilder<KmsShowData> {

/**
 *
 * Creates a Builder for KmsShowData
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline){

      super(KmsShowData.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
    }

    }


}