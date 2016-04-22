/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.module.msdatamodule;

import org.kurento.client.*;

/**
 *
 * KmsShowFaces interface. Documentation about the module
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface KmsShowFaces extends Filter {



/**
 *
 * Sets the desired visualisation
 *
 * @param visualisationId
 *       uniqueId of the visualisation
 *
 **/
  void setVisualisation(@org.kurento.client.internal.server.Param("visualisationId") int visualisationId);

/**
 *
 * Asynchronous version of setVisualisation:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see KmsShowFaces#setVisualisation
 *
 * @param visualisationId
 *       uniqueId of the visualisation
 *
 **/
    void setVisualisation(@org.kurento.client.internal.server.Param("visualisationId") int visualisationId, Continuation<Void> cont);

/**
 *
 * Sets the desired visualisation
 *
 * @param visualisationId
 *       uniqueId of the visualisation
 *
 **/
    void setVisualisation(Transaction tx, @org.kurento.client.internal.server.Param("visualisationId") int visualisationId);


/**
 *
 * Sets the desired rendering area
 *
 * @param x
 *       x coord of the area
 * @param y
 *       y coord of the area
 * @param width
 *       width of the area
 * @param height
 *       height of the area
 *
 **/
  void setVisualisationArea(@org.kurento.client.internal.server.Param("x") int x, @org.kurento.client.internal.server.Param("y") int y, @org.kurento.client.internal.server.Param("width") int width, @org.kurento.client.internal.server.Param("height") int height);

/**
 *
 * Asynchronous version of setVisualisationArea:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see KmsShowFaces#setVisualisationArea
 *
 * @param x
 *       x coord of the area
 * @param y
 *       y coord of the area
 * @param width
 *       width of the area
 * @param height
 *       height of the area
 *
 **/
    void setVisualisationArea(@org.kurento.client.internal.server.Param("x") int x, @org.kurento.client.internal.server.Param("y") int y, @org.kurento.client.internal.server.Param("width") int width, @org.kurento.client.internal.server.Param("height") int height, Continuation<Void> cont);

/**
 *
 * Sets the desired rendering area
 *
 * @param x
 *       x coord of the area
 * @param y
 *       y coord of the area
 * @param width
 *       width of the area
 * @param height
 *       height of the area
 *
 **/
    void setVisualisationArea(Transaction tx, @org.kurento.client.internal.server.Param("x") int x, @org.kurento.client.internal.server.Param("y") int y, @org.kurento.client.internal.server.Param("width") int width, @org.kurento.client.internal.server.Param("height") int height);

    



    public class Builder extends AbstractBuilder<KmsShowFaces> {

/**
 *
 * Creates a Builder for KmsShowFaces
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline){

      super(KmsShowFaces.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
    }

    }


}