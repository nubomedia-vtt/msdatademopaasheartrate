/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.module.msdatamodule;

import org.kurento.client.*;

/**
 *
 * KmsSendData interface. Documentation about the module
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface KmsSendData extends MediaElement {


    



    public class Builder extends AbstractBuilder<KmsSendData> {

/**
 *
 * Creates a Builder for KmsSendData
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline){

      super(KmsSendData.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
    }

    }


}