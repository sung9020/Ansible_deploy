import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Heroes package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Heroes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Heroes }
     * 
     */
    public Heroes createHeroes() {
        return new Heroes();
    }

    /**
     * Create an instance of {@link Heroes.Hero }
     * 
     */
    public Heroes.Hero createHeroesHero() {
        return new Heroes.Hero();
    }

    /**
     * Create an instance of {@link Heroes.Hero.Cost }
     * 
     */
    public Heroes.Hero.Cost createHeroesHeroCost() {
        return new Heroes.Hero.Cost();
    }

    /**
     * Create an instance of {@link Heroes.Hero.Stat }
     * 
     */
    public Heroes.Hero.Stat createHeroesHeroStat() {
        return new Heroes.Hero.Stat();
    }

    /**
     * Create an instance of {@link Heroes.Hero.Skill }
     * 
     */
    public Heroes.Hero.Skill createHeroesHeroSkill() {
        return new Heroes.Hero.Skill();
    }

}
