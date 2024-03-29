package atlas;

/**
 * atlas._UseCase implements the Bridge and Command patterns.
 * The Business Rules in atlas.UseCases are specific
 * only to the application to be generated by Atlas.
 *
 * In other words, the step of creating atlas._UseCase objects
 * is performed after Atlas.generateMVC() has been called.
 *
 * atlas._UseCase objects interact with atlas.Models._Entity objects in a
 * controlling way.
 *
 * atlas._UseCase objects comprise the Application Layer.
 * If still confused, read up, the link below.
 * https://softwareengineering.stackexchange.com/questions/140999/application-layer-vs-domain-layer
 * If still Dying.... just, here.
 * https://youtu.be/Nsjsiz2A9mg?t=884
 *
 * Rules for the atlas._UseCase:
 *  ABSOLUTELY NOTHING KNOWS ABOUT THIS CLASS.
 *      atlas._UseCase objects Implement an inputBoundary interface,
 *      and have reference to an outputBoundary interface,
 *      FOR EACH COMPONENT of the application (database, web,
 *      additional frameworks) and it has access to all
 *      necessary entities.
 */

public interface UseCase extends InputBoundary
{
    void execute();
}
