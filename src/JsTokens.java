import java.util.HashSet;
import java.util.List;
import java.util.Set;

public enum JsTokens {
    JsVariable,
    JsFunction,
    JsFunctionStart,
    JsFunctionEnd,
    JsOperation ,
    JsEvaluate;

    public Set<String> announcedVars;
    public String name;
    JsTokens (String name) {
        this(name, new HashSet<>());
    }

    JsTokens (String name, Set<String> announcedVars) {
        this.name = name;
        this.announcedVars = announcedVars;
    }

    JsTokens() {}
}
